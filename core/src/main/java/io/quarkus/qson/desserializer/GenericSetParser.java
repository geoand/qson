package io.quarkus.qson.desserializer;

import java.util.HashSet;

public class GenericSetParser extends BaseParser implements JsonParser {

    public static final GenericSetParser PARSER = new GenericSetParser();

    @Override
    public void beginList(ParserContext ctx) {
        ctx.pushTarget(new HashSet());
    }

}
