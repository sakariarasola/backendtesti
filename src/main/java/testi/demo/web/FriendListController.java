package testi.demo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import testi.demo.domain.Friend;

@Controller
public class FriendListController {

	private List<Friend> friends = new ArrayList<>();

	@GetMapping("/index2")
	public String showFriendForm(Model model) {
		model.addAttribute("friend", new Friend());
		model.addAttribute("friends", friends);
		return "friendList";
	}

	@PostMapping("/index2")
	public String addFriend(@ModelAttribute("friend") Friend friend, Model model) {
		friends.add(friend);

		return "redirect:/index2";
	}
}
