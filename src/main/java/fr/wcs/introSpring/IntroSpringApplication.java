package fr.wcs.introSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class IntroSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroSpringApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {

		return "<ul>" +
				"<li> <a href = 'http://localhost:8080/doctor/1'> First doctor</a> </li> " +
				"<li> <a href = 'http://localhost:8080/doctor/2'> Second doctor</a> </li> " +
				"<li> <a href = 'http://localhost:8080/doctor/3'> Third doctor</a> </li> " +
				"<li> <a href = 'http://localhost:8080/doctor/4'> Fourth doctor</a> </li> " +
				"<li> <a href = 'http://localhost:8080/doctor/5'> Fifth doctor</a> </li> " +
				"<li> <a href = 'http://localhost:8080/doctor/6'> Sixth doctor</a> </li> " +
				"<li> <a href = 'http://localhost:8080/doctor/7'> Seventh doctor</a> </li> " +
				"<li> <a href = 'http://localhost:8080/doctor/8'> Eighth doctor</a> </li> " +
				"<li> <a href = 'http://localhost:8080/doctor/9'> Ninth doctor</a> </li> " +
				"<li> <a href = 'http://localhost:8080/doctor/10'> Tenth doctor</a> </li> " +
				"<li> <a href = 'http://localhost:8080/doctor/11'> Eleventh doctor</a> </li> " +
				"<li> <a href = 'http://localhost:8080/doctor/12'> Twelfth doctor</a> </li> " +
				"<li> <a href = 'http://localhost:8080/doctor/13'> Thirteenth doctor</a> </li> " +
				"</ul>";
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1() {
		return "William Hartnell <br> <a href = 'http://localhost:8080/'> Retour </a>" ; }

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctor2() {
		return "Patrick Throughton <br> <a href = 'http://localhost:8080'> Retour </a>" ;
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String doctor3() {
		return "Jon Pertwee <br> <a href = 'http://localhost:8080/'> Retour </a>";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4() {
		return "Tom Baker <br> <a href = 'http://localhost:8080/'> Retour </a>";
	}

	@RequestMapping("/doctor/5")
	@ResponseBody
	public String doctor5() {
		return "Peter Davison <br> <a href = 'http://localhost:8080/'> Retour </a>";
	}

	@RequestMapping("/doctor/6")
	@ResponseBody
	public String doctor6() {
		return "Colin Baker <br> <a href = 'http://localhost:8080/'> Retour </a>"; }

	@RequestMapping("/doctor/7")
	@ResponseBody
	public String doctor7() {
		return "Sylvester McCoy <br> <a href = 'http://localhost:8080/'> Retour </a>"; }

	@RequestMapping("/doctor/8")
	@ResponseBody
	public String doctor8() {
		return "Paul McGann <br> <a href = http://localhost:8080/'> Retour </a>"; }

	@RequestMapping("/doctor/9")
	@ResponseBody
	public String doctor9() {
		return "Christopher Eccleston <br> <a href = http://localhost:8080/'> Retour </a>"; }

	@RequestMapping("/doctor/10")
	@ResponseBody
	public String doctor10() {
		return "David Tennant <br> <a href = http://localhost:8080/'> Retour </a>"; }

	@RequestMapping("/doctor/11")
	@ResponseBody
	public String doctor11() {
		return "Matt Smith <br> <a href = 'http://localhost:8080/'> Retour </a>"; }

	@RequestMapping("/doctor/12")
	@ResponseBody
	public String doctor12() {
		return  "Peter Capaldi <br> <a href = 'http://localhost:8080/'> Retour </a>"; }

	@RequestMapping("/doctor/13")
	@ResponseBody
	public String doctor13() {
		return "Jodie Whittaker <br> <a href = 'http://localhost:8080/'> retour </a>"; }
}