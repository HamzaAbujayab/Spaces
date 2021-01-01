package com.example.criminalrecord.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.criminalrecord.Model.FamilyRelation;
import com.example.criminalrecord.R;

import java.util.ArrayList;

public class FamilyRelationAdapter extends RecyclerView.Adapter<FamilyRelationAdapter.ViewHolder> {

    Context context;
    ArrayList<FamilyRelation> familyRelationArrayList;

    public FamilyRelationAdapter(Context context, ArrayList<FamilyRelation> familyRelationArrayList) {
        this.context = context;
        this.familyRelationArrayList = familyRelationArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.family_relation_item, parent, false);
        return new FamilyRelationAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    FamilyRelation familyRelation = familyRelationArrayList.get(position);
    holder.name_of_user_family.setText(familyRelation.getName());
   // holder.date_of_birth_family.setText(familyRelation.getDateOfBirth());
 //   holder.ID_number_family.setText(familyRelation.getIdNumber());
   // holder.type_of_relation_family.setText(familyRelation.getTypeOfRelation());


    }

    @Override
    public int getItemCount() {
        return familyRelationArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name_of_user_family , ID_number_family , type_of_relation_family , date_of_birth_family;
        ImageView image_user_family;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name_of_user_family = itemView.findViewById(R.id.name_of_user_family);
            ID_number_family = itemView.findViewById(R.id.ID_number_family);
            type_of_relation_family = itemView.findViewById(R.id.type_of_relation_family);
            date_of_birth_family = itemView.findViewById(R.id.date_of_birth_family);
            image_user_family = itemView.findViewById(R.id.image_user_family);

        }
    }
}
