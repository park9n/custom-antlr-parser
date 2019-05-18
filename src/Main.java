import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("test.cpp");
            FileInputStream input = new FileInputStream(file);
            CPP14Lexer lexer = new CPP14Lexer(new ANTLRInputStream(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CPP14Parser parser = new CPP14Parser(tokens);
            CPP14Parser.TranslationunitContext tree = parser.translationunit();
            CPP14ParserBaseListener extractor = new CPP14ParserBaseListener();
            ParseTreeWalker.DEFAULT.walk(extractor, tree);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
