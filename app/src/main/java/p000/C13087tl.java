package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.database.alarmclock.AlarmClockMessage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: tl */
/* JADX INFO: loaded from: classes4.dex */
public class C13087tl extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: c */
    public static final int f85149c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f85150d = 1;

    /* JADX INFO: renamed from: a */
    public f f85151a;

    /* JADX INFO: renamed from: b */
    public List<Object> f85152b = new ArrayList();

    /* JADX INFO: renamed from: tl$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AlarmClockMessage f85153a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ rf8 f85154b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ RecyclerView.ViewHolder f85155c;

        public a(final AlarmClockMessage val$alarmClockMessage, final rf8 val$binding, final RecyclerView.ViewHolder val$holder) {
            this.f85153a = val$alarmClockMessage;
            this.f85154b = val$binding;
            this.f85155c = val$holder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            boolean z = !this.f85153a.isOpen();
            this.f85154b.f78154c.setSelected(z);
            this.f85153a.setOpen(z);
            C13087tl.this.notifyItemChanged(this.f85155c.getLayoutPosition());
            if (C13087tl.this.f85151a != null) {
                C13087tl.this.f85151a.onSwitchClick(this.f85153a, this.f85155c.getLayoutPosition());
            }
        }
    }

    /* JADX INFO: renamed from: tl$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AlarmClockMessage f85157a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RecyclerView.ViewHolder f85158b;

        public b(final AlarmClockMessage val$alarmClockMessage, final RecyclerView.ViewHolder val$holder) {
            this.f85157a = val$alarmClockMessage;
            this.f85158b = val$holder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (C13087tl.this.f85151a != null) {
                C13087tl.this.f85151a.onMoreClick(this.f85157a, this.f85158b.getLayoutPosition());
            }
        }
    }

    /* JADX INFO: renamed from: tl$c */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AlarmClockMessage f85160a;

        public c(final AlarmClockMessage val$alarmClockMessage) {
            this.f85160a = val$alarmClockMessage;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (C13087tl.this.f85151a != null) {
                C13087tl.this.f85151a.click(this.f85160a);
            }
        }
    }

    /* JADX INFO: renamed from: tl$d */
    public static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public rf8 f85162a;

        public d(rf8 binding) {
            super(binding.getRoot());
            this.f85162a = binding;
        }
    }

    /* JADX INFO: renamed from: tl$e */
    public static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public sf8 f85163a;

        public e(sf8 binding) {
            super(binding.getRoot());
            this.f85163a = binding;
        }
    }

    /* JADX INFO: renamed from: tl$f */
    public interface f {
        void click(AlarmClockMessage alarmClockMessage);

        void onMoreClick(AlarmClockMessage alarmClockMessage, int position);

        void onSwitchClick(AlarmClockMessage alarmClockMessage, int position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<Object> list = this.f85152b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        Object obj = this.f85152b.get(position);
        if (obj instanceof String) {
            return 0;
        }
        if (obj instanceof AlarmClockMessage) {
            return 1;
        }
        return super.getItemViewType(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, int position) {
        int itemViewType = getItemViewType(position);
        Object obj = this.f85152b.get(position);
        if (itemViewType == 0 && (holder instanceof e)) {
            ((e) holder).f85163a.f81657b.setText((String) obj);
            return;
        }
        if (itemViewType == 1 && (holder instanceof d)) {
            AlarmClockMessage alarmClockMessage = (AlarmClockMessage) obj;
            rf8 rf8Var = ((d) holder).f85162a;
            rf8Var.f78155d.setText(alarmClockMessage.getAlarmDescription());
            rf8Var.f78157f.setText(nn1.convertTimestampToOnlyHour(alarmClockMessage.getAlarmTime()));
            rf8Var.f78154c.setSelected(alarmClockMessage.isOpen());
            rf8Var.f78154c.setVisibility(alarmClockMessage.isOutOfTime() ? 8 : 0);
            rf8Var.f78156e.setVisibility(alarmClockMessage.isOutOfTime() ? 0 : 8);
            rf8Var.f78154c.setOnClickListener(new a(alarmClockMessage, rf8Var, holder));
            rf8Var.f78153b.setOnClickListener(new b(alarmClockMessage, holder));
            holder.itemView.setOnClickListener(new c(alarmClockMessage));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        return viewType == 0 ? new e(sf8.inflate(layoutInflaterFrom, parent, false)) : new d(rf8.inflate(layoutInflaterFrom, parent, false));
    }

    public void setData(List<Object> groupedDataList) {
        this.f85152b = groupedDataList;
        notifyDataSetChanged();
    }

    public void setDataAlarm(List<AlarmClockMessage> dataList) {
        this.f85152b.clear();
        this.f85152b.addAll(dataList);
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(f onItemClickListener) {
        this.f85151a = onItemClickListener;
    }
}
