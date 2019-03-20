package tom.r.ahmennn.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import tom.r.ahmennn.Model.Characters;
import tom.r.ahmennn.R;

public class CharacterListAdapter extends RecyclerView.Adapter<CharacterListAdapter.MyViewHolder> {

    Context context;
    List<Characters> characterList;

    public CharacterListAdapter(Context context, List<Characters> characterList) {
        this.context = context;
        this.characterList = characterList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.character_list_item,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //Load image
        Glide.with(context).load(characterList.get(position).getImage()).into(holder.character_image);
        //Set Name
        holder.character_name.setText(characterList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return characterList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView character_image;
        TextView character_name;

        public MyViewHolder(View itemView){
            super(itemView);

            character_image = (ImageView)itemView.findViewById(R.id.character_image);
            character_name = (TextView) itemView.findViewById(R.id.character_name);
        }
    }
}
