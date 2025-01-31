package com.example.myapplication_dz_16122024;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyViewPaint(this));
    }
}
class MyViewPaint extends View {

    public MyViewPaint(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
//        // здесь будем рисовать
//        Paint paint = new Paint();
//        paint.setColor(Color.RED); // цвет маркера
//        // paint.setColor(getResources().getColor(R.color.black,null));
//        // paint.setColor(Color.parseColor("#00ff00"));
//        paint.setStyle(Paint.Style.STROKE); // тип заливки
//        paint.setStrokeWidth(8); // толщина маркера
//        paint.setAntiAlias(true); // сглаживания
//        canvas.drawColor(Color.YELLOW);
//        paint.setColor(Color.GREEN);
//        canvas.drawCircle(200,200,300,paint);
//
//        paint.setStyle(Paint.Style.FILL);
//        paint.setColor(Color.parseColor("#ff0000"));
//        canvas.drawCircle(getWidth()/2,getHeight()/2,200,paint);
//
//        paint.setColor(Color.BLUE);
//        canvas.drawLine(300,500,600,600,paint);
//
//        Rect rect = new Rect(400,600,700,800);
//
//        canvas.drawRect(rect, paint);
//
//        paint.setColor(Color.MAGENTA);
//        RectF rect2 = new RectF(400,800,700,1000);
//        canvas.drawOval(rect2,paint);
//
//        paint.setTextSize(100);
//        canvas.drawText("Samsung IT School",400,1200,paint);
//        // поворот холста
//        canvas.rotate(-45,200,200);
//        canvas.drawText("Hello!",0,500,paint);
//        canvas.rotate(45,200,200);

//---------
        Paint paint = new Paint();
        // Небо
        paint.setColor(Color.BLACK);
        paint.setColor(Color.parseColor("#87CEFA"));
        canvas.drawRect(0,0,1100,1200,paint);
        //Солнце
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(50,50,100,paint);

        // Трава
        paint.setColor(Color.BLACK);
        canvas.drawRect(0,800,1100,1200,paint);
        paint.setColor(Color.parseColor("#006400"));
        canvas.drawRect(1,802,1199,1199,paint);

        //Нижняя часть здания
        paint.setColor(Color.BLACK);
        canvas.drawRect(100,600,500,1000,paint);
        paint.setColor(Color.parseColor("#8B4513"));
        canvas.drawRect(101,601,498,998,paint);

        //Дверь
        paint.setColor(Color.BLACK);
        canvas.drawRect(310,720,450,1000,paint);
        paint.setColor(Color.parseColor("#8B4513"));
        canvas.drawRect(312,722,448,998,paint);

        //Окно
        paint.setColor(Color.BLACK);
        canvas.drawRect(130,720,250,900,paint);
        paint.setColor(Color.parseColor("#8B4513"));
        canvas.drawRect(132,722,248,898,paint);

        //Крыша
        paint.setColor(Color.BLACK);
        Path path = new Path();
        path.moveTo(100,600);
        path.lineTo(300,400);
        path.lineTo(500,600);
        canvas.drawPath(path,paint);
        paint.setColor(Color.parseColor("#8B4513"));
        Path path1 = new Path();
        path1.moveTo(100,600);
        path1.lineTo(300,403);
        path1.lineTo(499,599);
        canvas.drawPath(path1,paint);

        //Окно на крыше
        paint.setColor(Color.BLACK);
        canvas.drawCircle(300,530,50,paint);
        paint.setColor(Color.parseColor("#8B008B"));
        canvas.drawCircle(300,530,49,paint);

        //Ствол дерево
        paint.setColor(Color.parseColor("#8B4513"));
        canvas.drawRect(680,900,700,1000,paint);

        //Листва дерева
        paint.setColor(Color.BLACK);
        canvas.drawOval(600,500,780,950,paint);
        paint.setColor(Color.GREEN);
        canvas.drawOval(602,502,778,948,paint);

        //Ножка скамейки правая
        paint.setColor(Color.BLACK);
        canvas.drawRect(820,930,855,1000,paint);
        paint.setColor(Color.GRAY);
        canvas.drawRect(822,932,853,998,paint);

        //Ножка скамейки лвая
        paint.setColor(Color.BLACK);
        canvas.drawRect(920,930,955,1000,paint);
        paint.setColor(Color.GRAY);
        canvas.drawRect(922,932,953,998,paint);

        //Сидушка скамейки
        paint.setColor(Color.BLACK);
        canvas.drawRect(780,900,990,930,paint);
        paint.setColor(Color.GRAY);
        canvas.drawRect(782,902,988,928,paint);

        //Полосы на окне крыши
        for (int j = 0; j < 4; j++){
            paint.setColor(Color.BLUE);
            canvas.drawLine(250+j*20,480, 350,580-j*20,paint);
            canvas.drawLine(250,480+j*20, 350-j*20,580,paint);

        }

        // Полосы на окне
        for (int i = 0; i < 6; i++){
                paint.setColor(Color.BLUE);
                canvas.drawLine(140+20*i,721, 140+20*i,899,paint);
        }
        for (int i = 0; i < 8; i++){
            paint.setColor(Color.BLUE);
            canvas.drawLine(131,733+22*i, 249,733+22*i,paint);
        }

        //Полосы на двери

            for (int j = 0; j < 7; j++){
                paint.setColor(Color.parseColor("#F0E68C"));
                canvas.drawLine(312+j*20,722, 448,998-j*40,paint);
                canvas.drawLine(312,722+j*40, 448-j*20,998,paint);

            }
        //Полосы солнца

        for (int j = 0; j < 12; j++){
            paint.setColor(Color.YELLOW);
            canvas.drawLine(0,0, 500-j*10,500-j*40,paint);
            canvas.drawLine(0,0, 500-j*40,500-j*10,paint);

        }


// ляляля
    }
    //-------
}