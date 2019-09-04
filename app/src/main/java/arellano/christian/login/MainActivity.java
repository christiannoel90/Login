package arellano.christian.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNombre, editTextPass;
    Button botonIngreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //match con la vista
        setContentView(R.layout.activity_main);
        //match de los widgets
        editTextNombre = findViewById(R.id.etNombre);
        editTextPass = findViewById(R.id.etPass);
        botonIngreso = findViewById(R.id.btnEntrar);

        botonIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombreUsuario = editTextNombre.getText().toString();
                String password = editTextPass.getText().toString();

                if(nombreUsuario.isEmpty() || password.isEmpty()){
                    //nombre de usuario vacio
                    mensajito( /*mensaje: */" El usuario o contraseña estan vacios");
                }else{
                    if(nombreUsuario.equals("christian") && password.equals("1234")){
                        //imprimir bienvenido
                        mensajito(/*mensaje:*/ "Bienvenido!!!");
                    }else{
                        //imprimir datos erroneos
                    }
                }
            }
        });

    }

    public void mensajito(String mensaje){
        Toast.makeText(/*context:*/ this,mensaje,Toast.LENGTH_LONG).show();
    }
}
