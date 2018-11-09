/**
 * 
 */
package org.cloudbus.cloudsim.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gautham
 *
 */
public class Dag_Node {

	public Dag_Node(int p_id, List<Dag_Node> child_processes,int time) {
		super();
		this.p_id = p_id;
		this.time = time;
		this.delay=0;
		this.parent_process = new ArrayList<Dag_Node>();
		this.child_processes = new ArrayList<Dag_Node>();
		
	}
	/**
	 * @param args
	 */
	int p_id;
	public int time;
	int init_qid;
	double delay;
	List<Dag_Node> parent_process;
	List<Dag_Node> child_processes;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getTime() {
		return time;
	}
	public List<Dag_Node> getChildprocesses() {
		return child_processes;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public List<Dag_Node> getParent_process() {
		return parent_process;
	}
	public double getdelay() {
		return delay;
	}
	public void addParent_process(Dag_Node parent_process) {		
			this.delay=Math.max(this.delay,(parent_process.getdelay()+0.001*(parent_process.getTime())));
		
		//this.delay=max_delay;
		this.parent_process.add(parent_process);
	} 
	
	public void addchild(Dag_Node child){
		this.child_processes.add(child);
	}
	public int getInit_qid() {
		return init_qid;
	}
	public void setInit_qid(int init_qid) {
		this.init_qid = init_qid;
	}

}



