package com.sec13.myNio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;

// 디렉토리 순회하면서 각 파일의 사이즈를 계산해서 전체 크기를 리턴하자.
public class f_FileWalk extends SimpleFileVisitor<Path>{
	private long totalSize = 0;
	
	public long getTotalSize() {
		return totalSize;
	}
	
	public static void main(String[] args) throws IOException {
		Path start = Paths.get(".");
		f_FileWalk visitor = new f_FileWalk();
		Files.walkFileTree(start, visitor);
		System.out.println("Total Size : "+visitor.getTotalSize());
	}
}
