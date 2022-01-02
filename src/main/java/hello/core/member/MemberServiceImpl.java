package hello.core.member;

public class MemberServiceImpl implements MemberService{

    //사람이 가입하고 찾으려면 뭐가필요?->멤버 저장소가 필요하지.
    //memberRepository 인터페이스는 적었는데.. 이러만 적으면 인셉션 널포인트?에러나겠져?->저장하려해도 구현체가없으니까.
    //그래서 구현객체를 선택해조야해->new MemoryMemberRepository(); 이 부분이 그부분..
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        System.out.println(member);
        //이곳에서 JOIN호출하면 다형성에 의해서 memberRepository인터페이스가아닌 오버라이드한 memberRepository에 있는(구현한)SAVE가 호출된다?
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
