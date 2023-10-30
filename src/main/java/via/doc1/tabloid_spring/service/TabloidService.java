package via.doc1.tabloid_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via.doc1.tabloid_spring.model.Department;
import via.doc1.tabloid_spring.repository.DepartmentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TabloidService {

    @Autowired
    DepartmentRepository departmentRepository;

    private static final List<Department> departments = new ArrayList<>();

    public Department getDepartment(int departmentId) {
        return departments.get(departmentId);
    }
}
