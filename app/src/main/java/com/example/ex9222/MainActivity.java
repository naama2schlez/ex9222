package com.example.ex9222;

import android.os.Bundle;





import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    LinearLayout lin;
    Button b1,b2,b3,b4;
    TextView tv;
    AlertDialog.Builder a1,a2,a3,a4;

    Boolean bt1,bt2,bt3,bt4;

    String b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lin = findViewById(R.id.main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        tv = findViewById(R.id.tv);

        bt1=true;
        bt2=false;     bt3=false;     bt4=false;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (bt1)
                {
                    a1=new AlertDialog.Builder(MainActivity.this);
                    String [] n={"סרט" ,"ים" , "מסעדה" , "הופעה"};
                    String [] color ={"#D0B8FF", "#0089EB", "#FF9E61", "#00C471"};
                    a1.setTitle("בחר את סוג הבילוי : ");
                    a1.setItems(n, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            tv.setText("הבילוי הנבחר: " + n[i]);
                            lin.setBackgroundColor(Color.parseColor(color[i]));
                            b =n[i];
                            bt1=false;
                            bt2=true;
                        }
                    });

                    AlertDialog a=a1.create();
                    a.show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bt2)
                {
                    a2=new AlertDialog.Builder(MainActivity.this);
                    String [] movie={"אשראי", "כרטיס לסרט" , "חטיפים", "בקבוק מים"};
                    String [] sea={"קרם הגנה", "מגבת" , "אוכל", "בקבוק מים"};
                    String [] res={"כסף", "מצלמה" , "כרטיס הזמנה", "איפור קליל"};
                    String [] app={"כסף", "כרטיס להופעה" , "בושם", "בקבוק מים"};

                    a2.setTitle("בחר כיבוד וציוד לבילוי");
                    StringBuilder st= new StringBuilder(" מה צריך להביא לבילוי? ");

                    if(b.equals("סרט"))
                    {
                        boolean [] check= {false, false, false, false};
                        a2.setMultiChoiceItems(movie, check, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                                check[i]=b;
                            }
                        });

                        a2.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                int count=0;
                                for(int j=0; j<4; j++)
                                    if(check[j]){
                                        st.append(movie[j] +" , ");
                                        count++;}
                                if(count== 0)
                                    tv.setText(tv.getText() + "\n" + "לא נבחר להביא כלום לבילוי");
                                else
                                    tv.setText(tv.getText() + "\n" + st);
                                bt2=false;
                                bt3=true;

                            }
                        });

                        a2.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                    }

                    else
                    if(b.equals("ים"))
                    {
                        boolean [] check= {false, false, false, false};
                        a2.setMultiChoiceItems(sea, check, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                                check[i]=b;
                            }
                        });

                        a2.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                int count=0;
                                for(int j=0; j<4; j++)
                                    if(check[j]){
                                        st.append(sea[j] +" , ");
                                        count++;}
                                if(count== 0)
                                    tv.setText(tv.getText() + "\n" + "לא נבחר להביא כלום לבילוי");
                                else
                                    tv.setText(tv.getText() + "\n" + st);
                                bt2=false;
                                bt3=true;

                            }
                        });

                        a2.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                    }

                    else
                    if(b.equals("מסעדה"))
                    {
                        boolean [] check= {false, false, false, false};
                        a2.setMultiChoiceItems(res, check, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                                check[i]=b;
                            }
                        });

                        a2.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                int count=0;
                                for(int j=0; j<4; j++)
                                    if(check[j]){
                                        st.append(res[j] +" , ");
                                        count++;}
                                if(count== 0)
                                    tv.setText(tv.getText() + "\n" + "לא נבחר להביא כלום לבילוי");
                                else
                                    tv.setText(tv.getText() + "\n" + st);
                                bt2=false;
                                bt3=true;

                            }
                        });

                        a2.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                    }

                    else
                    {
                        boolean [] check= {false, false, false, false};
                        a2.setMultiChoiceItems(app, check, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                                check[i]=b;
                            }
                        });

                        a2.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                int count=0;
                                for(int j=0; j<4; j++)
                                    if(check[j]){
                                        st.append(app[j] +" , ");
                                        count++;}
                                if(count== 0)
                                    tv.setText(tv.getText() + "\n" + "לא צריך להביא כלום לבילוי");
                                else
                                    tv.setText(tv.getText() + "\n" + st);
                                bt2=false;
                                bt3=true;

                            }
                        });

                        a2.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                    }

                    AlertDialog a=a2.create();
                    a.show();;
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bt3)
                {
                    a3=new AlertDialog.Builder(MainActivity.this);

                    EditText et=new EditText(MainActivity.this);
                    et.setHint("הכנס את שמך");
                    a3.setView(et);

                    a3.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            String name=et.getText().toString();
                            Toast.makeText(MainActivity.this, "Hello " + name + "\n" + " תהנה בבילוי!!", Toast.LENGTH_SHORT).show();
                            bt3=false;
                            bt4=true;
                        }
                    });
                    AlertDialog a=a3.create();
                    a.show();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bt4)
                {
                    a4=new AlertDialog.Builder(MainActivity.this);

                    a4.setTitle("Delete");
                    a4.setIcon(R.drawable.baseline_delete_24);
                    a4.setMessage("האם אתה בטוח שברצונך לאפס את הבחירות?");

                    a4.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            lin.setBackgroundColor(Color.WHITE);
                            tv.setText("");
                            Toast.makeText(MainActivity.this, "האיפוס בוצע בהצלחה:)", Toast.LENGTH_SHORT).show();
                            bt1=true;
                            bt2=false;
                            bt3=false;
                            bt4=false;
                        }
                    });

                    a4.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
                    AlertDialog a=a4.create();
                    a.show();
                }
            }
        });


    }
}