package smart.tiknsync.com.smart;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AvaliableCars_Fragment extends Fragment {

    RecyclerView rvCarsList;

    public AvaliableCars_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_avaliable_cars, container, false);

        rvCarsList = v.findViewById(R.id.rvCarsList);

        rvCarsList.setLayoutManager(new LinearLayoutManager(getActivity()));

        rvCarsList.setItemAnimator(new DefaultItemAnimator());

        ArrayList<String> CarName = new ArrayList<>();
        CarName.add("HYUNDAI");
        CarName.add("MERCEDES");
        CarName.add("KIA");
        CarName.add("HONDA");
        CarName.add("SUZUKI");
        CarName.add("TOYOTA");
        CarName.add("YUTONG");

        Adapter adapter = new Adapter(getActivity(), CarName);

        rvCarsList.setAdapter(adapter);

        return v;
    }

}
