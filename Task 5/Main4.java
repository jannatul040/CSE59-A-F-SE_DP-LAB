lass patient{
    private String patientName;
    private String nationalId;

    public patient(String patientName, String nationalId){
        this.patientName = patientName;
        this.nationalId = nationalId;
    }
    public String getPatientName(){
        return patientName;

    }
    public String getNationalId(){
        return nationalId;
    }
}

    
class IdValidator{
    public boolean validate(String nationalId){
        return nationalId.length() == 10|| nationalId.length() == 17;
    }
}

class SmsService{
    private IdValidator validator = new IdValidator();

    public void sendConfirmation(patient patient){
        if(validator.validate(patient.getNationalId())){
            System.out.println("Sending SMS to "+ patient.getPatientName()+ ":Registration successful");
        }
    } 
}
public class Main3 {
    public static void main(String[] args) {
    patient patient = new patient("Rahim", "1234567890");   
        SmsService sms = new SmsService();
        sms.sendConfirmation(patient);
    }
    
}
