package model;

/**
 * Created by Apraxin Vladimir on 15.12.16.
 */
public class Specialty {

    private final long id;
    private final String name;

    public class Builder {

        private long id;
        private String name;

        public Builder id(long id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        public Specialty build() {
            return new Specialty(this);
        }
    }

    private Specialty(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
