package com.app.jetpackexperiments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class BFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_b, container, false);

        Button b =view.findViewById(R.id.button_b);
        TextView tvB =view.findViewById(R.id.tv_b);

//        int a =getArguments().getInt("flowStepNumber");
//        tvB.setText(String.valueOf(a));

        int a = BFragmentArgs.fromBundle(getArguments()).getFlowStepNumber();
        tvB.setText(String.valueOf(a));



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.next_action);
            }
        });


        return  view;
    }
}
