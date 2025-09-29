package org.OrientaçãoObejto;
import org.OrientaçãoObejto.ClasseFilho.Uchiha;
import org.OrientaçãoObejto.ClasseFilho.Uzumaki;



public class Main {
    public static void main(String[] args) {
      //Objeto 1
      Uzumaki naruto = new Uzumaki();
        naruto.setNome("Naruto Uzumaki");
        naruto.getNome();
        naruto.setIdade(16);
        naruto.temBiju = true;
        naruto.ataqueBase();

        Uchiha sasuke = new Uchiha();
        sasuke.setNome("Sasuke Uchiha");
        sasuke.getNome();
        sasuke.sharingan();
        sasuke.ataqueBase(3);
    }
}
