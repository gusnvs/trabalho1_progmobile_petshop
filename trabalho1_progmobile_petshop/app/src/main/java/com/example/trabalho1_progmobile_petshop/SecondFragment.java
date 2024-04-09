package com.example.trabalho1_progmobile_petshop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.trabalho1_progmobile_petshop.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(v ->
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment)
        );

        int[] list_animais = new int[]{
                R.drawable.arara1,
                R.drawable.arara2,
                R.drawable.coelho,
                R.drawable.dalmata,
                R.drawable.gato1,
                R.drawable.gato2,
                R.drawable.husky,
                R.drawable.pug,
                R.drawable.porquinho1,
                R.drawable.porquinho2,
                R.drawable.passarinho,
        };

        binding.grid1.setAdapter(new Adaptador(getContext(), list_animais));
        binding.grid1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String categoria = "";
                switch (position) {
                    case 0:
                        categoria = "Arara";
                        break;
                    case 1:
                        categoria = "Arara";
                        break;
                    case 2:
                        categoria = "Coelho";
                        break;
                    case 3:
                        categoria = "Cachorro";
                        break;
                    case 4:
                        categoria = "Gato";
                        break;
                    case 5:
                        categoria = "Gato";
                        break;
                    case 6:
                        categoria = "Cachorro";
                        break;
                    case 7:
                        categoria = "Cachorro";
                        break;
                    case 8:
                        categoria = "Porquinho";
                        break;
                    case 9:
                        categoria = "Porquinho";
                        break;
                    case 10:
                        categoria = "Passarinho";
                        break;

                }
                binding.textviewSecond.setText("Categoria: "+categoria);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}