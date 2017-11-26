package org.wulfnoth.hdpcheck.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

public class ReaderCheck {

	public static void main(String[] args) throws IOException {
		FileSystem fs = FileSystem.get(new Configuration());
		System.out.println(fs.getClass().getName());
		FSDataInputStream in = fs.open(new Path("hdfs://localhost:9000/user/cloud/test"));
		System.out.println(in.getClass().getName());
//		byte[] buff = new byte[4096];
//		int length;
//		StringBuilder sb = new StringBuilder();
//		while ((length = in.read(buff)) > 0) {
//			sb.append(new String(buff, 0, length));
//		}
//		System.out.println(sb.toString());
	}

}
