package org.cloudbus.cloudsim.examples;
import java.util.Comparator;

public class TimeComparator implements Comparator<Dag_Node>{ 
    
	@Override
    public int compare(Dag_Node s1, Dag_Node s2) { 
        if (s1.time> s2.time) 
            return 1; 
        else if (s1.time < s2.time) 
            return -1; 
        else
        	return 0; 
        } 
} 