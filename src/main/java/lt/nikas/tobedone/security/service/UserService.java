package lt.nikas.tobedone.security.service;

import lombok.RequiredArgsConstructor;
import lt.nikas.tobedone.security.jpa.entity.User;
import lt.nikas.tobedone.security.jpa.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

  private final UserRepository userRepository;

  @Override
  public User loadUserByUsername(String username) throws UsernameNotFoundException {
    return userRepository.findWithRolesByUsername(username)
      .orElseThrow(() -> new UsernameNotFoundException(username));
  }
}
