package org.everit.json.schema.listener;

import org.everit.json.schema.ConditionalSchema;
import org.json.JSONObject;

public class ConditionalSchemaMatchEvent extends ConditionalSchemaValidationEvent {

    public ConditionalSchemaMatchEvent(ConditionalSchema schema, Object instance, Keyword keyword) {
        super(schema, instance, keyword);
    }

    @Override void describeTo(JSONObject obj) {
        obj.put("type", "match");
        obj.put("keyword", keyword.toString());
    }

    @Override public boolean equals(Object o) {
        return o instanceof ConditionalSchemaMatchEvent && super.equals(o);
    }

}