/*
Definiti un array de 2 dimensiuni,
fiecare dimensiune sa aiba cate 3,
respectiv 5 elemente.
Initializati array-ul.
Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.
 */
// Foarte bine! Te rog daca poti, sa-l faci folosing bucla for ;)

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5},
                {3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12}
        };
        System.out.println(arr[0][0]);
        System.out.println(arr[0][4]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][4]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][4]);
    }
}

