package org.gitlab4j.api.models;

import org.gitlab4j.models.utils.JacksonJson;

public class ChildEpic extends AbstractEpic<ChildEpic> {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return (JacksonJson.toJsonString(this));
    }
}
