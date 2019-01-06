package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class FileOperator {
	//�����ļ���
	public boolean CreateFolder(String folder_path, boolean is_absolute) {
		File file = new File(folder_path);
		if (file.isFile()) {
			return false;
		}
		if(file.exists()) {
			return true;
		}
		boolean b_status = false;
		if(is_absolute) {
			b_status = file.mkdirs();
		} else {
			b_status = file.mkdir();
		}
		return b_status;
	}
	//ɾ��
	public void Delete(String path) {
		File file = new File(path);
		if(!file.exists()) {
			System.out.printf("[%s] is not exist", path);
			return;
		}
		
		if(file.isFile()) {
			file.delete();
		} else if (file.isDirectory()) {
			File[] all_file = file.listFiles();
			for(File current_file : all_file) {
				Delete(current_file.getAbsolutePath());
			}
			/*for(int index = 0; index < all_file.length; index++) {
				File current_file = all_file[index];
				Delete(current_file.getAbsolutePath());
			}*/
		}
		file.delete();
	}
	//�����ļ���
	public void TraverseFolder(String folder) {
		File file = new File(folder);
		if (!file.exists()) {
			System.out.println("Folder is not exist.");
			return;
		} else if(!file.isDirectory()) {
			System.out.println("Path is not directory.");
			return;
		}
		
		File[] all_files = file.listFiles();
		for(int index = 0; index < all_files.length; index++) {
			File current_file = all_files[index];
			if (current_file.isFile()) {	//�Ƿ��ļ�
				System.out.println(current_file.getAbsolutePath());
			} else if (current_file.isDirectory()) {	//��Ŀ¼
				TraverseFolder(current_file.getAbsolutePath());
			}
		}
	}
	//���ļ�
	public void ReadFileContent(String file_name) {
		File file = new File(file_name);
		if(!file.exists()) {
			System.out.printf("[%s] is not exist", file_name);
			return;
		}
		if(!file.isFile()) {
			System.out.printf("[%s] is not file", file_name);
			return;
		}
		
		try {
			FileReader file_reader = new FileReader(file);
			BufferedReader buffered_reader = new BufferedReader(file_reader);
			
			String line_content = null;
			do {
				line_content = buffered_reader.readLine();
				if (line_content != null) {
					System.out.println(line_content);
				}
			} while (line_content != null);
			
			buffered_reader.close();
			file_reader.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//д�ļ�
	public void WriteFileContent(String file_name, String write_content) {
		try {
			File file = new File(file_name);
			FileWriter file_writer = new FileWriter(file, true);//true��ʾ׷��
			BufferedWriter buffered_writer = new BufferedWriter(file_writer);
			PrintWriter out = new PrintWriter(buffered_writer);
			
			out.append(write_content);
			out.println();
			out.flush();//ˢ�»�����������������д�룬�����ǵȵ������������д��
			out.close();
			System.out.println("Finish write.");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	//console����
	public void ConsoleInput() {
		System.out.println("Please put in:");
		Scanner scanner = new Scanner(System.in);
		
		String input_str = null;
		do {
			input_str = scanner.nextLine();
			if(input_str != null) {
				System.out.println(input_str);
				if (input_str.equals("end")) {
					break;
				}
			} 
		} while (input_str != null);
		System.out.println("Console end.");
	}

}
