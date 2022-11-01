package com.example.students.adapter;
//
import android.content.Context;//dung lam gi
import android.text.Layout;
import android.view.LayoutInflater;//dung ra sao
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;// tác dung la gi
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.students.R;
import com.example.students.model.Giaovien;

import java.util.List;


public class GiaovienAdapter extends BaseAdapter
{
    private Context context;
    private List<Giaovien> giaoviens;
    public GiaovienAdapter() {
    }

    public GiaovienAdapter(Context context, List<Giaovien> giaoviens) {
        this.context = context;
        this.giaoviens = giaoviens;
    }

    @Override
    public int getCount() {
        return giaoviens.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Viewholder viewholder;
        if (view == null) {
            viewholder = new Viewholder();
            //đưa code về view
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE );
            view = inflater.inflate(R.layout.listitemgiaovien,null);
            // ánh xạ
            viewholder.txtMaGV = view.findViewById(R.id.maGV);
            viewholder.txtHoten = view.findViewById(R.id.name);
            viewholder.txtGioitinh = view.findViewById(R.id.gioitinh);
            viewholder.txtEmail = view.findViewById(R.id.email);
            viewholder.txtPhone = view.findViewById(R.id.phone);
            viewholder.txtKKhoa = view.findViewById(R.id.khoa);
            viewholder.txtBomon = view.findViewById(R.id.bomon);
            view.setTag(viewholder);
        }else {
            viewholder =(Viewholder) view.getTag();
        }
        //điền thông tin
        Giaovien gv = giaoviens.get(i);
        viewholder.txtMaGV.setText("maGV"+gv.getMaGV());
        if (gv.getGioiTinh() == 0) {
            viewholder.ivHinh.setImageResource(R.drawable.download);
        }else {
            viewholder.ivHinh.setImageResource(R.drawable.female);
        }
        return view;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<Giaovien> getGiaoviens() {
        return giaoviens;
    }

    public void setGiaoviens(List<Giaovien> giaoviens) {
        this.giaoviens = giaoviens;
    }
    class Viewholder{
        ImageView ivHinh;
        TextView txtMaGV, txtHoten, txtGioitinh,txtEmail, txtPhone, txtKKhoa, txtBomon;
        
    }
}
