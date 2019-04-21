package firat.gurgur.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    UserAdapter userAdapter;
    List<UserModel> userModelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.userList_recyclerview);
        userModelList = new ArrayList<>();
        userModelList.add(new UserModel("Fırat","Gürgür","frtgurgur@gmail.com","https://d1xcdyhu7q1ws8.cloudfront.net/wp-content/uploads/2017/10/24114043/steve-harvey-face.png","Bilgisayar Mühendisi olarak kariyerine devam eden Fırat Gürgür Android developer olarak Altosis firmasında çalışmaktadır.","23","Android Dev."));
        userModelList.add(new UserModel("Fırat","Gürgür","frtgurgur@gmail.com","https://d1xcdyhu7q1ws8.cloudfront.net/wp-content/uploads/2017/10/24114043/steve-harvey-face.png","Bilgisayar Mühendisi olarak kariyerine devam eden Fırat Gürgür Android developer olarak Altosis firmasında çalışmaktadır.","23","Android Dev."));
        userModelList.add(new UserModel("Fırat","Gürgür","frtgurgur@gmail.com","https://d1xcdyhu7q1ws8.cloudfront.net/wp-content/uploads/2017/10/24114043/steve-harvey-face.png","Bilgisayar Mühendisi olarak kariyerine devam eden Fırat Gürgür Android developer olarak Altosis firmasında çalışmaktadır.","23","Android Dev."));
        userModelList.add(new UserModel("Fırat","Gürgür","frtgurgur@gmail.com","https://d1xcdyhu7q1ws8.cloudfront.net/wp-content/uploads/2017/10/24114043/steve-harvey-face.png","Bilgisayar Mühendisi olarak kariyerine devam eden Fırat Gürgür Android developer olarak Altosis firmasında çalışmaktadır.","23","Android Dev."));
        userModelList.add(new UserModel("Fırat","Gürgür","frtgurgur@gmail.com","https://d1xcdyhu7q1ws8.cloudfront.net/wp-content/uploads/2017/10/24114043/steve-harvey-face.png","Bilgisayar Mühendisi olarak kariyerine devam eden Fırat Gürgür Android developer olarak Altosis firmasında çalışmaktadır.","23","Android Dev."));


        userAdapter =new UserAdapter(userModelList,this);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        linearLayoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(linearLayoutManager);





        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(userAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


    }
}
