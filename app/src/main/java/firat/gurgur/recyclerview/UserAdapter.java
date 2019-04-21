package firat.gurgur.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class UserAdapter  extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView nameAndSurname;
        public TextView age;
        public TextView job;
        public TextView mail;
        public TextView detail;
        public ImageView image;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameAndSurname = itemView.findViewById(R.id.listNameSurname);
            age = itemView.findViewById(R.id.listAge);
            job = itemView.findViewById(R.id.listJob);
            mail = itemView.findViewById(R.id.listMail);
            detail = itemView.findViewById(R.id.listDetail);
            image = itemView.findViewById(R.id.listPhoto);
            cardView = itemView.findViewById(R.id.cardviewList);
        }
    }

    private List<UserModel> user_list;
    private Context context;

    UserAdapter(List<UserModel> user_list, Context context){
        this.user_list = user_list;
        this.context = context;
    }

    @NonNull
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

      View vr = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list,parent,false);
      final  ViewHolder view_holder = new ViewHolder(vr);



        return view_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.nameAndSurname.setText(user_list.get(position).getUserName() + " " + user_list.get(position).getUserSurname());
        holder.age.setText(user_list.get(position).getUserAge());
        holder.job.setText(user_list.get(position).getUserJob());
        holder.mail.setText(user_list.get(position).getUserMail());
        holder.detail.setText(user_list.get(position).getUserDetail());


        Picasso.with(context)
                .load(user_list.get(position).getUserPhotoUrl())
                .placeholder(R.drawable.loading)
                .error(R.drawable.error)
                .into(holder.image);


    }

    @Override
    public int getItemCount() {
        return user_list.size();
    }




}
