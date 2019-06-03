package mail.FilePath;

import java.util.LinkedList;
import java.util.Stack;

/**
 * "./"과 "../" 이 포함된 파일 경로를 "./"과 "../"이 없는 유닉스 파일 경로로 바꾸시오. "./"는 현재의 위치를 뜻하고,
 * "../"는 상위 디렉토리를 뜻합니다. Given a file path containing "./" and "../", convert
 * the path to a unix standard file path that does not contain "./" and "../".
 * 
 * input: "/usr/bin/../" output: "/usr/"
 * 
 * input: "/usr/./bin/./test/../" output: "/usr/bin/"
 */
public class FilePath {

    static String getPath(String path) {
        String[] arr = path.split("/");
        Stack<String> temp = new Stack<String>();
        // O(n)
        for(int i = arr.length-1; i >=0; i--){
            temp.add(arr[i]);
        }
        LinkedList<String> ret = new LinkedList<String>();
        // O(n)
        while (!temp.isEmpty()){
            String e = temp.pop();
            if (e.equals(".")){
                continue;
            }else if (e.equals("..")){
                if (ret.size() > 0 ){
                    ret.removeLast();
                }
            }else{
                ret.add(e);
            }
        }
        return String.join("/",ret)+"/";
    }

    public static void main(String args[]) {
        String path = "/usr/./bin/./test/../";
        System.out.println(path);
        System.out.println(getPath(path));
        path = "/usr/bin/../";
        System.out.println(path);
        System.out.println(getPath(path));
        path = "/../";
        System.out.println(path);
        System.out.println(getPath(path));

    }

}
