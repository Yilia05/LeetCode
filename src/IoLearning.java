import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/**
 * Created by Yilia on 2018/4/7.
 */
public class IoLearning {

  public static void main(String[] args) {
    // 基于字节操作的
    InputStream inputStream;
    OutputStream outputStream;

    // 基于字符操作的
    Writer writer;
    Reader reader;

    // 基于磁盘操作的
    File file;

    try {
      FileReader fileReader = new FileReader("filename");
//      BufferedInputStream
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }
}
