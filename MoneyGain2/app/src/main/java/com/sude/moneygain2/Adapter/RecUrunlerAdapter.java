package com.sude.moneygain2.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sude.moneygain2.Model.RecUrunlerHelperClasses;
import com.sude.moneygain2.R;
import com.sude.moneygain2.User.Urunler.GideSekerlemeUrunleri.LaysYogurtMevsimYesillikleriPatatesCipsi;
import com.sude.moneygain2.User.Urunler.IcecekUrunleri.CappyMeyveSuyuVisne1lt;
import com.sude.moneygain2.User.Urunler.IcecekUrunleri.CaykurRizeTuristCay500g;
import com.sude.moneygain2.User.Urunler.IcecekUrunleri.CocaCola2_5L;
import com.sude.moneygain2.User.Urunler.IcecekUrunleri.DogusIhlamur20li;
import com.sude.moneygain2.User.Urunler.IcecekUrunleri.FrukoGazoz;
import com.sude.moneygain2.User.Urunler.IcecekUrunleri.Nescafe2si1Arada;
import com.sude.moneygain2.User.Urunler.IcecekUrunleri.Nescafe3u1AradaSade;
import com.sude.moneygain2.User.Urunler.IcecekUrunleri.PoweradeSporcuIcecegi500Ml;
import com.sude.moneygain2.User.Urunler.SutKahvaltiUrunleri.AnavarzaCicekBali850g;
import com.sude.moneygain2.User.Urunler.SutKahvaltiUrunleri.DanoneSutKakaolu180Ml;
import com.sude.moneygain2.User.Urunler.SutKahvaltiUrunleri.EtiLifalifYulafEzmesi500g;
import com.sude.moneygain2.User.Urunler.SutKahvaltiUrunleri.GoldKremfistikSekerIlavesizYerFistigiEzmesi340g;
import com.sude.moneygain2.User.Urunler.SutKahvaltiUrunleri.MarmaraBirlikKuruSeleZeytin400g;
import com.sude.moneygain2.User.Urunler.SutKahvaltiUrunleri.NestleNesquikKakaoluMisirGevregi310gr;
import com.sude.moneygain2.User.Urunler.SutKahvaltiUrunleri.PinarProteinLaktozsuzKakaoluSut500ml;
import com.sude.moneygain2.User.Urunler.SutKahvaltiUrunleri.TorkuBanada400g;

import java.util.ArrayList;

public class RecUrunlerAdapter extends RecyclerView.Adapter<RecUrunlerAdapter.RecUrunViewHolder> {


    ArrayList<RecUrunlerHelperClasses> recUrunlerLocations;

    public RecUrunlerAdapter(ArrayList<RecUrunlerHelperClasses> recUrunlerLocations) {
        this.recUrunlerLocations = recUrunlerLocations;
    }

    @NonNull
    @Override
    public RecUrunViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.urunler_card_dizyn, parent, false);
        RecUrunViewHolder recUrunViewHolder = new RecUrunViewHolder(view);

        return recUrunViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecUrunViewHolder holder, int position) {

        RecUrunlerHelperClasses recUrunlerHelperClasses = recUrunlerLocations.get(position);

        holder.image1.setImageResource(recUrunlerHelperClasses.getImage1());
        holder.title1.setText(recUrunlerHelperClasses.getTitle1());

        holder.image2.setImageResource(recUrunlerHelperClasses.getImage2());
        holder.title2.setText(recUrunlerHelperClasses.getTitle2());



    }

    @Override
    public int getItemCount() {
        return recUrunlerLocations.size();
    }


    public static class RecUrunViewHolder extends RecyclerView.ViewHolder{


        LinearLayout linearLayout1, linearLayout2;
        ImageView image1, image2;
        TextView title1, title2;


        public RecUrunViewHolder(@NonNull View itemView) {
            super(itemView);


            linearLayout1 = itemView.findViewById(R.id.linearLayout1);
            linearLayout2 = itemView.findViewById(R.id.linearLayout2);
            image1 = itemView.findViewById(R.id.rec_urunler_image1);
            title1 = itemView.findViewById(R.id.rec_urunler_title1);

            image2 = itemView.findViewById(R.id.rec_urunler_image2);
            title2 = itemView.findViewById(R.id.rec_urunler_title2);

            title1.setEnabled(false);
            title2.setEnabled(false);


            linearLayout1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(title1.getText().equals("Danone Süt Kakaolu 180 Ml")) {

                        Intent intent = new Intent(v.getContext(), DanoneSutKakaolu180Ml.class);
                        v.getContext().startActivity(intent);

                    }

                    else if(title1.getText().equals("Nestle Mısır Gevreği Çikolatalı 310 G")) {

                        Intent intent = new Intent(v.getContext(), NestleNesquikKakaoluMisirGevregi310gr.class);
                        v.getContext().startActivity(intent);

                    }


                    else if(title1.getText().equals("Pınar Protein Laktozsuz Kakaolu Süt 500 ml")) {

                        Intent intent = new Intent(v.getContext(), PinarProteinLaktozsuzKakaoluSut500ml.class);
                        v.getContext().startActivity(intent);

                    }

                    else if(title1.getText().equals("Torku Banada 400 g")) {

                        Intent intent = new Intent(v.getContext(), TorkuBanada400g.class);
                        v.getContext().startActivity(intent);

                    }

                    else if(title1.getText().equals("Coca Cola 2,5L")) {

                        Intent intent = new Intent(v.getContext(), CocaCola2_5L.class);
                        v.getContext().startActivity(intent);

                    }

                    else if(title1.getText().equals("Powerade Ice Blast 500 ml")) {

                        Intent intent = new Intent(v.getContext(), PoweradeSporcuIcecegi500Ml.class);
                        v.getContext().startActivity(intent);

                    }

                    else if(title1.getText().equals("Nescafe 3ü1 Arada Sade")) {

                        Intent intent = new Intent(v.getContext(), Nescafe3u1AradaSade.class);
                        v.getContext().startActivity(intent);

                    }

                    else if(title1.getText().equals("Doğuş Ihlamur Çayı 20'li")) {

                        Intent intent = new Intent(v.getContext(), DogusIhlamur20li.class);
                        v.getContext().startActivity(intent);

                    }

                    else if(title1.getText().equals("Lays Fırından Patates Cipsi Mevsim Yeşillikleri 96 G")) {

                        Intent intent = new Intent(v.getContext(), LaysYogurtMevsimYesillikleriPatatesCipsi.class);
                        v.getContext().startActivity(intent);

                    }

                }

            });



            linearLayout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(title2.getText().equals("Eti Lifalif Yulaf Ezmesi 500 g")) {

                        Intent intent = new Intent(v.getContext(), EtiLifalifYulafEzmesi500g.class);
                        v.getContext().startActivity(intent);

                    }

                    else if(title2.getText().equals("Gold Kremfıstık Şeker İlavesiz Yer Fıstığı Ezmesi 340 g")) {

                        Intent intent = new Intent(v.getContext(), GoldKremfistikSekerIlavesizYerFistigiEzmesi340g.class);
                        v.getContext().startActivity(intent);

                    }

                    else if(title2.getText().equals("Anavarza Çiçek Balı 850 g")) {

                        Intent intent = new Intent(v.getContext(), AnavarzaCicekBali850g.class);
                        v.getContext().startActivity(intent);

                    }

                    else if(title2.getText().equals("Marmara Birlik Kuru Sele Zeytin 400 g Pet")) {

                        Intent intent = new Intent(v.getContext(), MarmaraBirlikKuruSeleZeytin400g.class);
                        v.getContext().startActivity(intent);

                    }

                    else if(title2.getText().equals("Çaykur Rize Turist Çay 500 g")) {

                        Intent intent = new Intent(v.getContext(), CaykurRizeTuristCay500g.class);
                        v.getContext().startActivity(intent);

                    }

                    else if(title2.getText().equals("Cappy Meyve Suyu Vişne 1 lt")) {

                        Intent intent = new Intent(v.getContext(), CappyMeyveSuyuVisne1lt.class);
                        v.getContext().startActivity(intent);

                    }

                    else if(title2.getText().equals("Nescafe 2'si 1 Arada 10 g")) {

                        Intent intent = new Intent(v.getContext(), Nescafe2si1Arada.class);
                        v.getContext().startActivity(intent);

                    }

                    else if(title2.getText().equals("Fruko Gazoz Karışık Meyve Aromalı Gazoz Kutu 33 cl")) {

                        Intent intent = new Intent(v.getContext(), FrukoGazoz.class);
                        v.getContext().startActivity(intent);

                    }
                }
            });

        }
    }



}