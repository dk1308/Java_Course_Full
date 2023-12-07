import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class Fraction implements Comparable<Fraction> {
    private int tuSo;
    private int mauSo;
    
    public Fraction() {
        
    }

    public Fraction(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public float getRealValue(){
        return (float)this.tuSo/(float)this.mauSo;
    }
    
    public Fraction multiply(Fraction o) {
        return new Fraction(this.tuSo*o.tuSo, this.mauSo*o.mauSo);
    }
    
    public Fraction reverse(){
        return new Fraction(this.mauSo, this.tuSo);
    }
    
    public Fraction randomFrac(){
        Random rand = new Random();
        int tuSo = rand.nextInt(100)+1;
        int mauSo = rand.nextInt(100)+1;
        return new Fraction(tuSo, mauSo);
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }

    @Override
    public int compareTo(Fraction o) {
        if(this.getRealValue()>o.getRealValue()) return 1;
        else if(this.getRealValue()<o.getRealValue()) return -1;
        return 0;
    }
    
    public static void main(String[] args) {
        ArrayList<Fraction> listFrac = new ArrayList();
        int i =0;
        while(i<10){
//            Fraction newFraction = new Fraction(i, i)
            listFrac.add(new Fraction().randomFrac());
            i++;
        }
        for(Fraction frac: listFrac) {
            System.out.print(frac+" | ");
        }
        Collections.sort(listFrac, new Comparator<Fraction>() {
			@Override
			public int compare(Fraction o1, Fraction o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
        System.out.println("\nSau khi sap xep tu be den lon");
        for(Fraction frac: listFrac) {
            System.out.print(frac+" | ");
        }
    }
}
