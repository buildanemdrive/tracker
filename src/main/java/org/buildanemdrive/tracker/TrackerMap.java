package org.buildanemdrive.tracker;

import java.io.IOException;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class TrackerMap<K1, V1, K2, V2> extends MapReduceBase implements Mapper<IntWritable, FloatWritable, IntWritable, IntWritable> {

	@Override
	public void map(IntWritable correlationId, FloatWritable frequency, OutputCollector<IntWritable, IntWritable> output, Reporter reporter)
			throws IOException {
		// TODO Auto-generated method stub
		
	}

}
