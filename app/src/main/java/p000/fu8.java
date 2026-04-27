package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public class fu8 extends RecyclerView.Adapter<C5989b> {

    /* JADX INFO: renamed from: d */
    public static final String f37775d = "LanguageSelectAdapter";

    /* JADX INFO: renamed from: a */
    public int[] f37776a;

    /* JADX INFO: renamed from: b */
    public final Context f37777b;

    /* JADX INFO: renamed from: c */
    public InterfaceC5990c f37778c;

    /* JADX INFO: renamed from: fu8$a */
    public class ViewOnClickListenerC5988a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f37779a;

        public ViewOnClickListenerC5988a(final int val$position) {
            this.f37779a = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            fu8.this.f37778c.click(this.f37779a);
        }
    }

    /* JADX INFO: renamed from: fu8$b */
    public static class C5989b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public sve f37781a;

        public C5989b(sve binding) {
            super(binding.getRoot());
            this.f37781a = binding;
        }
    }

    /* JADX INFO: renamed from: fu8$c */
    public interface InterfaceC5990c {
        void click(int position);
    }

    public fu8(Context context) {
        this.f37777b = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f37776a.length;
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(int[] country) {
        this.f37776a = country;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(InterfaceC5990c onItemClickListener) {
        this.f37778c = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb C5989b holder, int position) {
        try {
            sve sveVar = holder.f37781a;
            sveVar.f83104d.setText(this.f37776a[position]);
            int[] iArr = new int[bu8.values().length];
            for (int i = 0; i < bu8.values().length; i++) {
                iArr[i] = bu8.values()[i].getStringDefaultResId();
            }
            sveVar.f83104d.setText(this.f37776a[position]);
            if (position == 0) {
                sveVar.f83105e.setText("");
            } else {
                sveVar.f83105e.setText(iArr[position]);
            }
            String string = vfe.getInstance().getString("CURRENT_LANGUAGE");
            if (TextUtils.isEmpty(string)) {
                if (bu8.getLanguageString(this.f37777b.getResources().getString(C2531R.string.is_follow_system), this.f37777b).equals(sveVar.f83104d.getText())) {
                    sveVar.f83102b.setBackgroundResource(C2531R.drawable.ic_checkbox);
                } else {
                    sveVar.f83102b.setBackgroundResource(C2531R.drawable.ic_unchecked);
                }
            } else if (bu8.getLanguageString(string, this.f37777b).equals(sveVar.f83104d.getText())) {
                sveVar.f83102b.setBackgroundResource(C2531R.drawable.ic_checkbox);
            } else {
                sveVar.f83102b.setBackgroundResource(C2531R.drawable.ic_unchecked);
            }
            holder.itemView.setOnClickListener(new ViewOnClickListenerC5988a(position));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public C5989b onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        return new C5989b(sve.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }
}
