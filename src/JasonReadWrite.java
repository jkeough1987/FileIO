import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by joshuakeough on 9/10/16.
 */
public class JasonReadWrite {





        public void writeJson(String fileName, Motorcycle motorcycle) throws IOException {
            JsonSerializer serializer = new JsonSerializer();
            String json = serializer.serialize(motorcycle);

            File Motorcycle_File = new File(fileName);
            FileWriter fw = new FileWriter(Motorcycle_File);
            fw.write(json);
            fw.close();
        }

        public Motorcycle readJson(String fileName) throws FileNotFoundException {
            File Motorcycle_File = new File(fileName);
            Scanner s = new Scanner(Motorcycle_File);
            s.useDelimiter("\\Z");
            String contents = s.next();
            s.close();

            JsonParser parser = new JsonParser();
            return parser.parse(contents, Motorcycle.class);

        }
}
