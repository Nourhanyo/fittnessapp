package com.example.fittnessapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ExampleDialog_h extends AppCompatDialogFragment {
    private EditText editTextUserName;
    private EditText editGender;
    private EditText editAge;
    private EditText editWeight;
    private EditText editHeight;
    private ExampleDialogListener listener;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_dialog_h, null);

        builder.setView(view)
                .setTitle("Edit")
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String name = editTextUserName.getText().toString();
                        String gender = editGender.getText().toString();
                        String age = editAge.getText().toString();
                        String weight = editWeight.getText().toString();
                        String height = editHeight.getText().toString();

                        listener.applyTexts(name,gender,age,weight,height);
                    }
                });
        editTextUserName = view.findViewById(R.id.edit_username);
        editGender = view.findViewById(R.id.edit_gender);
        editAge = view.findViewById(R.id.edit_age);
        editWeight = view.findViewById(R.id.edit_weight);
        editHeight = view.findViewById(R.id.edit_height);


        return builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        try {
            listener = (ExampleDialogListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString() +
                    "must emplement ExampleDialogListener");
        }

    }

    public interface ExampleDialogListener {
        void applyTexts(String name, String gender, String age, String weight, String  Height);
    }
}
