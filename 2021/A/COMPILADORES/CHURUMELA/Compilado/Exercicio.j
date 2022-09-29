.source Churumela.j
.class  public Churumela
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc 5
    ldc 1
    iadd
    invokevirtual java/io/PrintStream/println(I)V

    return
.limit stack 10
.end method
