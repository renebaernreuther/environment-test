package de.vemaeg.envtest;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public int add(int v1, int v2) {
        return v1 + v2;
    }
}
