package smart.tiknsync.com.smart;


import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Register_Fragment extends Fragment {

    EditText etEmail, etPassword;
    TextInputLayout tlEmail, tlPassword;
    Button btnRegister, btnLogin;
    TextView tvForgetPass, tvSkip;


    public Register_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_register, container, false);

        initializeControl(v);

        tvSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.flMain, new AvaliableCars_Fragment());
                transaction.commit();

            }
        });

        return v;
    }

    void initializeControl(View v) {
        etEmail = v.findViewById(R.id.etEmail);
        etPassword = v.findViewById(R.id.etPassword);
        tlEmail = v.findViewById(R.id.tlEmail);
        tlPassword = v.findViewById(R.id.tlPassword);
        btnRegister = v.findViewById(R.id.btnRegister);
        btnLogin = v.findViewById(R.id.btnLogin);
        tvForgetPass = v.findViewById(R.id.tvForgetPass);
        tvSkip = v.findViewById(R.id.tvSkip);
    }

}
