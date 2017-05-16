package yazdaniscodelab.recyclewithclickevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    String[] T_title,D_description,A_author,P_price,C_card;

    int[] img=new int[]{

            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.a,
            R.drawable.b,
            R.drawable.d,
            R.drawable.e,
            R.drawable.a,
            R.drawable.b,

    };

    public ArrayList<Data>arrayList=new ArrayList<Data>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycler_xml);

        T_title=getResources().getStringArray(R.array.title);
        D_description=getResources().getStringArray(R.array.description);
        A_author=getResources().getStringArray(R.array.author);
        P_price=getResources().getStringArray(R.array.price);
        C_card=getResources().getStringArray(R.array.card);

        int i=0;
        for (String title:T_title){
            Data data=new Data(img[i],title,D_description[i],A_author[i],P_price[i],C_card[i]);
            arrayList.add(data);
            i++;
        }
        adapter=new RecyclerViewAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
