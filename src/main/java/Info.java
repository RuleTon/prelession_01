public class Info {
    String firstName;
    String lastName;
    String middleName;
    String country;
    String address;
    String phone;
    int age;
    String gender;

    public static class Builder {
        private Info newInfo;

        public Builder() {
            newInfo = new Info();
        }

        public Builder withfirstName(String firstname){
            newInfo.firstName = firstname;
            return this;
        }

        public Builder withlastName(String lastName){
            newInfo.lastName = lastName;
            return this;
        }

        public Builder withmiddleName(String middleName){
            newInfo.middleName = middleName;
            return this;
        }

        public Builder withCountry(String country){
            newInfo.country = country;
            return this;
        }

        public Builder withAddress(String address){
            newInfo.address = address;
            return this;
        }

        public Builder withPhone(String phone){
            newInfo.phone = phone;
            return this;
        }

        public Builder withAge(int age){
            newInfo.age = age;
            return this;
        }

        public Builder withGender(String gender){
            newInfo.gender = gender;
            return this;
        }

        public Info build(){
            return newInfo;
        }

    }

    public static void main(String[] args) {
        Info myInfo = new Info.Builder()
                .withfirstName("James")
                .withlastName("Sunderland")
                .withmiddleName("Frank")
                .withCountry("USA")
                .withAddress("Portland")
                .withPhone("555-3535")
                .withAge(32)
                .withGender("Male")
                .build();

    }
}
