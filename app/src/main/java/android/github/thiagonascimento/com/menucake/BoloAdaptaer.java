package android.github.thiagonascimento.com.menucake;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Thiago on 02/11/2016.
 */

public class BoloAdaptaer extends BaseAdapter {

    List<Cake> cakes;
    Context ctx;

    public BoloAdaptaer(Context context, List<Cake> cakes) {
        this.cakes = cakes;
        this.ctx = context;
    }

    @Override
    public int getCount() {
        return cakes.size();
    }

    @Override
    public Object getItem(int position) {
        return cakes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Cake cake = cakes.get(position);

       ViewHolder viewHolder = null;
        if(view == null){
            view = LayoutInflater.from(ctx).inflate(R.layout.item_bolo, null);
            viewHolder = new ViewHolder();
            viewHolder.imagem_bolo = (ImageView) view.findViewById(R.id.imageviewbolo);
            viewHolder.nome_bolo_viewholder = (TextView) view.findViewById(R.id.textviewNomeBolo);
            viewHolder.qtd_de_calorias_viewholder = (TextView) view.findViewById(R.id.textviewcaloria);
            view.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) view.getTag();
        }
        Resources res = ctx.getResources();
        TypedArray typedArray = res.obtainTypedArray(R.array.imagens);
        viewHolder.imagem_bolo.setImageDrawable(typedArray.getDrawable(cake.posicao_no_item_bolo));
        viewHolder.nome_bolo_viewholder.setText(cake.nome_do_bolo);
        viewHolder.qtd_de_calorias_viewholder.setText(cake.quantidade_de_calorias);
        return view;
    }

    static class ViewHolder{
        ImageView imagem_bolo;
        TextView nome_bolo_viewholder;
        TextView qtd_de_calorias_viewholder;
    }

}
