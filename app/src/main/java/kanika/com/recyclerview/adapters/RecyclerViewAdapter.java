package kanika.com.recyclerview.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kanika.com.recyclerview.R;
import kanika.com.recyclerview.activities.MainActivity;

/**
 * Created by Kanika on 3/8/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;

    public RecyclerViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recycler_view, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof CustomViewHolder){
            CustomViewHolder viewHolder = (CustomViewHolder) holder;
            viewHolder.setDataInLayout(position);
        }
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    private class CustomViewHolder extends RecyclerView.ViewHolder {
        public CustomViewHolder(View view) {
            super(view);
        }

        public void setDataInLayout(int position) {

        }
    }
}
