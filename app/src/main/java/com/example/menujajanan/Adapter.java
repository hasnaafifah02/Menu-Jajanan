package com.example.menujajanan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class Holder extends RecyclerView.ViewHolder{
    ImageView img;
    TextView txtname, txtdesc, txtprice;

    public Holder(@NonNull View itemView) {
        super(itemView);

        img = itemView.findViewById(R.id.imgJajanan);
        txtname = itemView.findViewById(R.id.txtname);
        txtdesc = itemView.findViewById(R.id.txtdesc);
        txtprice = itemView.findViewById(R.id.txtprice);
    }
}

public class Adapter extends RecyclerView.Adapter<Holder> {
    Context context;
    ArrayList<Jajanan> listJajanan;

    public Adapter(Context context, ArrayList<Jajanan> listJajanan) {
        this.context = context;
        this.listJajanan = listJajanan;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Jajanan jajanan = listJajanan.get(position);
        holder.img.setImageResource(jajanan.getImage());
        holder.txtname.setText(jajanan.getNama());
        holder.txtdesc.setText(jajanan.getDescription());
        holder.txtprice.setText(""+jajanan.getPrice());
    }

    @Override
    public int getItemCount() {
        return listJajanan.size();
    }
}
