package hw214_2;

import java.util.Arrays;

import hw214_2.Ordered;


public class PolyDbl implements Ring, Modulo, Ordered {
    private double[] coef;
    
    public PolyDbl(double[] coef) {
        //TODO: implement this constructor
        //      leading zeros should be trimmed off
    	int n = coef.length;
    	while(n-1 >= 1 && coef[n-1] == 0)
    		n--;
    		
    	this.coef = new double[n];
    	for(int i = 0; i < n; i++)
    		this.coef[i] = coef[i];
    }
    
    public double[] getCoef() {
    	return coef;
    }
    
    //TODO: implement the rest
    
    public Ring add(Ring a) {
    	double[] result = new double[Math.max(coef.length, ((PolyDbl)a).coef.length)];
    		for(int i = 0; i < result.length; i++) {
    			if (coef.length > i) {
    				result[i] += coef[i];
    			}
    			if (((PolyDbl)a).coef.length > i) {
    				result[i] += ((PolyDbl)a).coef[i];
    			}
    		}

    	return new PolyDbl(result);
    }
    
    public Ring addIdentity() {
    	double[] result = new double[coef.length];
    	return new PolyDbl(result);
    }
    
    public Ring addInverse() {
    	double[] result = new double[this.coef.length];
    	for(int i = 0; i < result.length; i++) {
    		result[i] = -coef[i];
    	}
    	return new PolyDbl(result);
    }
    
    public Ring mul(Ring a) {
    	double[] d = new double[this.coef.length + ((PolyDbl)a).coef.length - 1];
        for(int i = 0; i < this.coef.length; i++)
        	for(int j = 0; j < ((PolyDbl)a).coef.length; j++)
        		d[i+j] += this.coef[i] * ((PolyDbl)a).coef[j];
    	return new PolyDbl(d);
    	
    	
    	
//    	double[] result = new double[this.coef.length];
//    	for(int i = 0; i < result.length; i++) {
//    		result[i] = coef[i] * ((PolyDbl)a).coef[i];
//    	}
//    	return  new PolyDbl(result);
    }
    
    public Ring mod(Ring a) {
    	double[] quo = new double[this.coef.length - ((PolyDbl)a).coef.length + 1];
    	double[] num = new double[this.coef.length];
    	double[] den = ((PolyDbl)a).coef;
    	int dd = den.length - 1;
    	
    	for(int i = 0; i < this.coef.length; i++)
        	num[i] = this.coef[i];
    	
    	for(int qi = quo.length - 1; qi >= 0; qi--) {
        	quo[qi] = num[qi + dd] / den[dd];
        	for(int i = 0; i < dd; i++)
        		num[qi+i] = num[qi+i] - quo[qi] * den[i];
        	num[qi+dd] = 0;
        }
    	
    	return new PolyDbl(num);
    	
    	
//    	double[] result = new double[this.coef.length];
//    	for(int i = 0; i < result.length; i++) {
//    		result[i] = coef[i] % ((PolyDbl)a).coef[i];
//    	}
//    	return  new PolyDbl(result);
    }
    
    public Ring quo(Ring a) {
    	double[] quo = new double[this.coef.length - ((PolyDbl)a).coef.length + 1];
    	double[] num = new double[this.coef.length];
    	double[] den = ((PolyDbl)a).coef;
    	int dd = den.length - 1;
    	
    	for(int i = 0; i < this.coef.length; i++)
        	num[i] = this.coef[i];
    	
    	for(int qi = quo.length - 1; qi >= 0; qi--) {
        	quo[qi] = num[qi + dd] / den[dd];
        	for(int i = 0; i < dd; i++)
        		num[qi+i] = num[qi+i] - quo[qi] * den[i];
        	num[qi+dd] = 0;
        }
    	
    	return new PolyDbl(quo);
    	
    	
//    	double[] result = new double[this.coef.length];
//    	for(int i = 0; i < result.length; i++) {
//    		result[i] = coef[i] / ((PolyDbl)n).coef[i];
//    	}
//    	return  new PolyDbl(result);
    }
    
    public boolean ge(Ordered a) {
    	if(coef.length != ((PolyDbl)a).coef.length) {
    		return coef.length >= ((PolyDbl)a).coef.length;
    	}else if(Arrays.equals(coef, ((PolyDbl)a).coef)) {
    		return true;
    	}else {
    		for(int i = coef.length - 1; i > 0; i --) {
    			if(coef[i] != ((PolyDbl)a).coef[i]) {
    				return coef[i] >= ((PolyDbl)a).coef[i];
    			}
    		}
    	}
		return false;
    }
}
