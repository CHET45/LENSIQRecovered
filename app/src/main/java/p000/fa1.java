package p000;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.mylhyl.circledialog.C3860a;
import com.mylhyl.circledialog.params.DialogParams;
import com.mylhyl.circledialog.params.ItemsParams;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fa1 extends ListView implements sg8 {

    /* JADX INFO: renamed from: a */
    public BaseAdapter f35815a;

    /* JADX INFO: renamed from: b */
    public DialogParams f35816b;

    /* JADX INFO: renamed from: c */
    public ItemsParams f35817c;

    /* JADX INFO: renamed from: d */
    public int f35818d;

    /* JADX INFO: renamed from: e */
    public int f35819e;

    /* JADX INFO: renamed from: fa1$a */
    public static class C5691a<T> extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public Context f35820a;

        /* JADX INFO: renamed from: b */
        public List<T> f35821b;

        /* JADX INFO: renamed from: c */
        public ItemsParams f35822c;

        /* JADX INFO: renamed from: fa1$a$a */
        public class a {

            /* JADX INFO: renamed from: a */
            public TextView f35823a;

            public a() {
            }
        }

        public C5691a(Context context, ItemsParams itemsParams) {
            this.f35820a = context;
            this.f35822c = itemsParams;
            Object obj = itemsParams.f24344a;
            if (obj != null && (obj instanceof Iterable)) {
                this.f35821b = (List) obj;
            } else {
                if (obj == null || !obj.getClass().isArray()) {
                    throw new IllegalArgumentException("entity must be an Array or an Iterable.");
                }
                this.f35821b = Arrays.asList((Object[]) obj);
            }
        }

        private void bindView(int i, C5691a<T>.a aVar) {
            T item = getItem(i);
            aVar.f35823a.setText(String.valueOf(item instanceof d02 ? ((d02) item).getItemLabel() : item.toString()));
            e02 e02Var = this.f35822c.f24343Y;
            if (e02Var != null) {
                e02Var.onBinder(aVar.f35823a, item, i);
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<T> list = this.f35821b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public T getItem(int i) {
            List<T> list = this.f35821b;
            if (list != null) {
                return list.get(i);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C5691a<T>.a aVar;
            if (view == null) {
                aVar = new a();
                TextView textView = new TextView(this.f35820a);
                textView.setGravity(17);
                textView.setTextSize(this.f35822c.f24350m);
                textView.setTextColor(this.f35822c.f24349f);
                textView.setHeight(C3860a.dp2px(this.f35820a, this.f35822c.f24345b));
                if (this.f35822c.f24347d != null) {
                    textView.setPadding(C3860a.dp2px(this.f35820a, r0[0]), C3860a.dp2px(this.f35820a, this.f35822c.f24347d[1]), C3860a.dp2px(this.f35820a, this.f35822c.f24347d[2]), C3860a.dp2px(this.f35820a, this.f35822c.f24347d[3]));
                }
                int i2 = this.f35822c.f24342X;
                if (i2 != 0) {
                    textView.setGravity(i2);
                }
                aVar.f35823a = textView;
                textView.setTag(aVar);
                view2 = textView;
            } else {
                view2 = view;
                aVar = (a) view.getTag();
            }
            bindView(i, aVar);
            return view2;
        }
    }

    public fa1(Context context, DialogParams dialogParams, ItemsParams itemsParams) {
        super(context);
        this.f35816b = dialogParams;
        this.f35817c = itemsParams;
        init();
    }

    private void init() {
        ItemsParams itemsParams = this.f35817c;
        int i = itemsParams.f24348e;
        if (i == 0) {
            i = this.f35816b.f24298H;
        }
        this.f35818d = i;
        int i2 = itemsParams.f24335C;
        if (i2 == 0) {
            i2 = this.f35816b.f24302Q;
        }
        this.f35819e = i2;
        setBackgroundColor(i);
        setSelector(new b02(0, this.f35819e));
        setDivider(new ColorDrawable(wz1.f95826k));
        setDividerHeight(C3860a.dp2px(getContext(), this.f35817c.f24346c));
        BaseAdapter baseAdapter = this.f35817c.f24336F;
        this.f35815a = baseAdapter;
        if (baseAdapter == null) {
            this.f35815a = new C5691a(getContext(), this.f35817c);
        }
        setAdapter((ListAdapter) this.f35815a);
    }

    @Override // p000.sg8
    public View getView() {
        return this;
    }

    @Override // p000.sg8
    public void refreshItems() {
        this.f35815a.notifyDataSetChanged();
    }

    @Override // p000.sg8
    public void regOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        setOnItemClickListener(onItemClickListener);
    }

    @Override // p000.sg8
    public void regOnItemClickListener(o4c o4cVar) {
    }
}
