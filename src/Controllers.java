//import java.util.ArrayList;
//import java.util.List;
//
//public class Controllers {
//
//    private List<Controllers> seekersList = new ArrayList<>();
//    private String userName;
//    private String gender;
//    private Seekers profileAccounts = new Seekers();
//    private String dateOfBirth;
//    private int id;
//    private String emailAddress;
//
//    public Controllers(String userName, String gender, int id, String dateOfBirth,String emailAddress) {
//        this.userName = userName;
//        this.gender = gender;
//        this.id = id;
//        this.dateOfBirth = dateOfBirth;
//        this.emailAddress = emailAddress;
//    }
//
//    public void registerSeeker(String name, String gender, int id, String dateOfBirth, String emailAddress) {
//
//        if (name == null || name.isEmpty() ||
//                gender == null || gender.isEmpty() ||
//                dateOfBirth == null || dateOfBirth.isEmpty() ||
//                emailAddress == null || emailAddress.isEmpty() ||
//                id <= 0) {
//
//            System.out.println("Field Cannot Be Empty");
//         }
//
//        Controllers controllers = new Controllers(name, gender, id, dateOfBirth, emailAddress);
//        seekersList.add(controllers);
//        repository.save();
//    }
//
//    public int updateSeekerProfile(int id, int newId) {
//        Controllers controllers = new Controllers(userName, gender, id, dateOfBirth,emailAddress);
//
//        for (Controllers account : seekersList) {
//            if (profileAccounts.getId() == this.id) {
//                newId = id;
//            }
//        }
//        return newId;
//    }
//}