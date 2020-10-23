package pr15;

public class Vector {
    int[] vec;
    int length;

    public Vector(int length) {
        this.length = length;
        vec=new int[length];
    }

    public Vector() {
        this.length = 0;
        vec=new int[0];
    }

    void add(int elem){
        int[] vecCopy =new int[length+1];
        System.arraycopy(vec, 0, vecCopy, 0, vec.length);
        vecCopy[length]=elem;
        vec=vecCopy;
        ++length;
    }

    void del(int index){
        if(length==0) return;
        int[] vecCopy =new int[length-1];
        for (int i = 0; i < index; i++) vecCopy[i]=vec[i];
        for (int i = index; i < length; i++) vecCopy[i]=vec[i+1];
        vec=vecCopy;
        --length;
    }

    int findVal(int val) throws VecException {
        for(int i=0;i<length;++i){
            if(vec[i]==val) return i;
        }
        throw new VecException("Don't have this elem");
    }

    int findInd(int ind) throws VecException {
        if(ind>=length || ind<0) throw new VecException("Not found");
        else return vec[ind];
    }
    int minEl() throws VecException {
        if(length==0) throw new VecException("Not elements in Vector");
        long min=(long)Integer.MAX_VALUE+2;
        for (int i = 0; i < length; i++) {
            if(vec[i]<min) min=vec[i];
        }
        return (int)min;
    }

    int maxEl() throws VecException {
        if(length==0) throw new VecException("Not elements in Vector");
        long max=(long)Integer.MIN_VALUE-2;
        for (int i = 0; i < length; i++) {
            if(vec[i]>max) max=vec[i];
        }
        return (int)max;
    }

    double average() throws VecException {
        if(length==0) throw new VecException("Not elements in Vector");
        int sum=0;
        for (int a : vec) sum += a;
        return (double)sum/(double) length;
    }
}
