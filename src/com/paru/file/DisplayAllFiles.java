package com.paru.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DisplayAllFiles {
	public static void main(String[] args) {
		try (Stream<Path> walk = Files.walk(Paths
				.get("D:\\Learnings\\Practice_Workspace_Java_1\\Core"))) {
			List<String> result = walk.filter(Files::isRegularFile)
					.map(x -> x.toString()).collect(Collectors.toList());
			result.stream().filter(x -> x != null).collect(Collectors.toList());
			List<String> filelist = result.stream()
					.filter(x -> x.endsWith(".java"))
					.collect(Collectors.toList());
			filelist.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
