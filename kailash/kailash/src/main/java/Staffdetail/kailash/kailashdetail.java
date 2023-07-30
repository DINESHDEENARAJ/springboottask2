package Staffdetail.kailash;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class kailashdetail
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int staffid;
    private String staffname;
    private String staffdept;
    private int staffroomno;
    private int staffbusno;
    private String staffcity;

}

