<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Meat">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="252dp"
        android:layout_marginTop="332dp"
        android:text="x $10 per kg"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="252dp"
        android:layout_marginTop="424dp"
        android:text="x $20 per kg"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <androidx.appcompat.widget.Toolbar
        android:layout_width="411dp"
        android:layout_height="90dp"
        android:background="@color/red"
        app:title="Meat"
        app:titleTextColor="@color/white"
        tools:layout_editor_absoluteX="0dp" />

    <TextView
        android:id="@+id/total"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="168dp"
        android:layout_marginTop="128dp"
        android:text=""
        android:textAlignment="center"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/chicken_count"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_marginStart="180dp"
        android:layout_marginTop="220dp"
        android:text=""
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/beef_count"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_marginStart="180dp"
        android:layout_marginTop="316dp"
        android:text=""
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/lamb_count"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_marginStart="180dp"
        android:layout_marginTop="416dp"
        android:text=""
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:layout_width="104dp"
        android:layout_height="36dp"
        android:layout_marginStart="64dp"
        android:layout_marginTop="220dp"
        android:text="Chicken:"
        android:textSize="25dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:layout_width="68dp"
        android:layout_height="36dp"
        android:layout_marginStart="100dp"
        android:layout_marginTop="324dp"
        android:text="Beef:"
        android:textSize="25dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:layout_width="74dp"
        android:layout_height="35dp"
        android:layout_marginStart="100dp"
        android:layout_marginTop="416dp"
        android:text="Lamb:"
        android:textSize="25dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/total_amount"
        android:layout_width="124dp"
        android:layout_height="49dp"
        android:layout_marginStart="140dp"
        android:layout_marginTop="512dp"
        android:backgroundTint="@color/red"
        android:text="Total"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/Checkout"
        android:layout_width="124dp"
        android:layout_height="49dp"
        android:layout_marginStart="140dp"
        android:layout_marginTop="600dp"
        android:backgroundTint="@color/red"
        android:text="Checkout"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="252dp"
        android:layout_marginTop="236dp"
        android:text="x $15 per kg"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />


</androidx.constraintlayout.widget.ConstraintLayout>
