package p000;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class twg<T> extends mki<T> {

    /* JADX INFO: renamed from: f */
    public static final int f86211f = 13415;

    /* JADX INFO: renamed from: twg$a */
    public class C13262a extends nki {
        public C13262a(View itemView) {
            super(itemView);
        }
    }

    /* JADX INFO: renamed from: twg$b */
    public class ViewOnClickListenerC13263b implements View.OnClickListener {
        public ViewOnClickListenerC13263b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            twg.this.getPicker().m12631e(v);
        }
    }

    public static int getTextId() {
        return f86211f;
    }

    @Override // p000.mki
    /* JADX INFO: renamed from: f */
    public void mo17365f(@efb nki holder, int position, T t) {
        ((TextView) holder.itemView.findViewById(f86211f)).setText(mo9242k(position, t));
        holder.itemView.setOnClickListener(new ViewOnClickListenerC13263b());
    }

    @Override // p000.mki
    /* JADX INFO: renamed from: g */
    public nki mo17366g(@efb ViewGroup parent, int viewType) {
        LinearLayout linearLayout = new LinearLayout(parent.getContext());
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(getPicker().f44967F, m17364b()));
        TextView textView = new TextView(parent.getContext());
        textView.setGravity(17);
        textView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        textView.setTextColor(-1);
        textView.setId(f86211f);
        textView.setTextSize(kqf.dp2px(9.0f));
        linearLayout.addView(textView);
        return new C13262a(linearLayout);
    }

    @Override // p000.mki
    /* JADX INFO: renamed from: h */
    public void mo17367h(RecyclerView.ViewHolder holder, float progress) {
        TextView textView = (TextView) holder.itemView.findViewById(f86211f);
        textView.setScaleY((Math.abs(progress) * 0.6f) + 0.4f);
        textView.setScaleX((Math.abs(progress) * 0.6f) + 0.4f);
        textView.setTextColor(Color.argb((int) ((Math.abs(progress) * 135.0f) + 120.0f), 255, 255, 255));
        textView.setAlpha((Math.abs(progress) * 105.0f) + 150.0f);
    }

    /* JADX INFO: renamed from: k */
    public abstract String mo9242k(int position, T t);
}
